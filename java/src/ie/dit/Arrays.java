package ie.dit;
import processing.core.PApplet;
public class Arrays extends PApplet
{
        float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58}; // array of float 
        String[] months = {"jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul","Aug","Sep", "Oct","Nov","Dec"}; // array of string 

        float[] fa = {10, 9}; // example of declaring array in java
        float[] ob = new float[2]; // make it an object 


    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        fa[0] = 10;
        fa[1] = 4; 

        System.out.println(fa[0]);
       // System.out.println(fa[2]); // exception rise = java type of error  // ---- A way to allocate an array (without assigning anythng )
 
        for (int i = 0; i < rainfall.length; i++) // iterate through a array  // .length is an bulit in function  
        {
            System.out.println(months[i] + "\t" + rainfall[i]);
        }


        for (float f : rainfall) // another way of iterating through an array  ..for each loop 
        {
            System.out.println(f); // rainfall = array of value , all the element will get printed out 
        }


        //Calculate total rainfall
        float total = 0; 
        for( float f: rainfall)
        {
            total += f;
        }
        System.out.println("Total: " + total);


        // calculate average amount of rainfall
        total = 0; 
        for(int i =0; i < rainfall.length; i++)
        {
            total += rainfall[i];
        }
        float average = total / (float) rainfall.length;
        System.out.println("Average:" +  average);

        // find the months with the heighst rainfall  ----- 2 ways to do ---
        // first way 1. 

        // float max = rainfall[0];
        int maxIndex = -1;
        // for (int i =1; i <  rainfall.length; i++)
        // {
        //     if (rainfall[i] > max)
        //     {
        //         max = rainfall[i];
        //         maxIndex = i; 
        //     }
        // }



        // 2nd way 

        float max = Float.MIN_VALUE;
        for (int i =1; i <  rainfall.length; i++)
        {
            if (rainfall[i] > max)
            {
                max = rainfall[i];
                maxIndex = i; 
            }
        }
            System.out.println(months[maxIndex] + "had the heighest rainfall:" + rainfall[maxIndex]);


        //Find the months with the lowest rainfall
        float min = Float.MAX_VALUE;
        int minIndex = -1; 
        for (int i = 0; i < rainfall.length; i++)
        {
            if(rainfall[i] < min)
            {
                min= rainfall[i];
                minIndex = i;
            }
        }
        System.out.println(months[minIndex] + "had the lowest rainfall: " + rainfall[minIndex]);
        
        // bar chart 
        /*colorMode(HSB);
        textAlign(LEFT, CENTER);

        float h = height / (float )rainfall.length;
        for (int i = 0; i < rainfall.length; i++)
        {   
            noStroke();
            fill(random(0, 255), 255, 255);
            // rect(0, i*h, rainfall[i], h); // start crorner 0 3rd width 
            rect(0, map(i, 0, rainfall.length, 0, height), rainfall[i] *2, h);
            fill(0);
            // float textY = i * h  + (h * 0.5f);
            float textY = map(i, 0, rainfall.length, h * 0.5f, height + (h * 0.2f)); // not completeed 
            text(months[i], 5, textY);*/
   
    }
    public void barchart()
    {
        int Barlines = rainfall.length; 
        float length = height / (float) Barlines;
        int coordy = 0; 
        for ( int i = 0; i < Barlines; i++)
        {
            rect(0,coordy,rainfall[i],length);
            coordy += length;
        }

    }
    public void draw()
        {

        /*
        int m = mouseY / rainfall.length;
        fill(0);
        text(rainfall[m], 400,300);*/
        barchart();
    }       


}