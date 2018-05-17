package com.sawickirafal.chapter002;

public class Exercise009 {
    public static void main(String[] args) {
        boolean b = true;
        char c = 'a';
        byte by = 123;
        short s = 256;
        int i = 1;
        long l = 1024L;
        float f = 1.1f;
        double d = 1.1;

        Boolean bObj = b;
        Character cObj = c;
        Byte byObj = by;
        Short sObj = s;
        Integer iObj = i;
        Long lObj = l;
        Float fObj = f;
        Double dObj = d;

        System.out.println(bObj);
        System.out.println(cObj);
        System.out.println(byObj);
        System.out.println(sObj);
        System.out.println(iObj);
        System.out.println(lObj);
        System.out.println(fObj);
        System.out.println(dObj);

        bObj = false;
        cObj++;
        byObj++;
        sObj++;
        iObj++;
        lObj++;
        fObj++;
        dObj++;

        b = bObj;
        c = cObj;
        by = byObj;
        s = sObj;
        i = iObj;
        l = lObj;
        f = fObj;
        d = dObj;

        System.out.println(b);
        System.out.println(c);
        System.out.println(by);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);


    }
}
