/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author wintermute
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args) {
        // TODO code application logic here
        TreeSet <Mark> A = new TreeSet <Mark>();
        A.add(new Mark(5,5));
        A.add(new Mark(-1,-1));
        A.add(new Mark(5,-5));
        A.add(new Mark(1,-1));
        A.add(new Mark(-3,-4));
        A.add(new Mark(0,0));
        A.add(new Mark(-4,4));
        float Ctr = lab2.read(args);
        if (Ctr<0) {System.out.println("R имеет некорректное знчение");}
        else
        {
        Iterator<Mark> iterator;
        iterator=A.iterator();
        while (iterator.hasNext()) 
        {
            Mark T=iterator.next();
            if (Contour.check(Ctr,T)==0) {System.out.println(T.X+" "+T.Y);}
        }
        }
    }
}

class lab2 {
    public static float read(String args)
    {
       // return Float.parseFloat(System.console().readLine());
       // java.util.Scanner input = new java.util.Scanner(System.in);
		float n;
		try {
        n=Float.parseFloat(args);}
		catch (Exception e) {n=-6; }
        return n;
    }
    
}

class Mark implements java.io.Serializable, java.lang.Comparable<Mark> {
    public Mark(float A, float B) {
    X=A;
    Y=B;
    comp= String.valueOf(A)+" "+String.valueOf(B) ;
}
    
    public float X;
    public float Y;
    private String comp;
    
    public int compareTo(Mark o)
            {
                return comp.compareTo(o.comp);
            }
    
}

class Contour {
    public static int check(float R, Mark A)
    {
        int l=0;
        if ((A.X<0) && (A.Y>0)) 
        {
            if ((A.X*A.X)+(A.Y*A.Y)<(R/2)*(R/2)) 
            {
                l = 1;
            }
        }
        else if ((A.X>0) && (A.Y<0)) 
            {
                if ((A.X<R) && (A.Y>-R/2))
                        {
                            l = 1;
                        }
            }
        else if ((A.X>0) && (A.Y>0))
        {
            if (A.X+A.Y<R)
            {
                l = 1;
            }
        }
        return l;
    }   
}
//1
//2
//3
