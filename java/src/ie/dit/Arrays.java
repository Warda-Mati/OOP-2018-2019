<<<<<<< HEAD
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


=======
package ie.dit;

import processing.core.PApplet;

public class Arrays extends PApplet
{
    float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"
            , "Aug", "Sep", "Oct", "Nov", "Dec"};

    float[] fa = new float[2];        
    int[] colors = new int[rainFall.length];

    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        // Putting values into array elements
        fa[0] = 10;
        fa[1] = 4;

        // Getting a value from an array element
        System.out.println(fa[0]);
        

        // Iterating over an array
        for(int i = 0 ; i < rainFall.length; i ++)
        {
            System.out.println(months[i] + "\t" + rainFall[i]);
        }

        // Using the for each loop
        for(float f:rainFall)
        {
            System.out.println(f);
        }

        // Calculate the total
        float total = 0;
        for(float f:rainFall)
        {
            total += f;
        }
        System.out.println("Total: " + total);

        // The same, but with a for loop
        total = 0;
        for(int i = 0 ; i < rainFall.length ; i ++)
        {
            total += rainFall[i];
        }


        float average = total / (float) rainFall.length;
        System.out.println(average);

        // Find the max element
        float max = Float.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0 ; i < rainFall.length ; i ++)
        {
            if (rainFall[i] > max)
            {
                max = rainFall[i];
                maxIndex = i;
            }
        }

        System.out.println(months[maxIndex] 
                + " had the highest rainfall of " 
                + rainFall[maxIndex]);

        // Find the min element                
        float min = Float.MAX_VALUE; // The biggest value a float can be
        int minIndex = -1;
        for(int i = 0 ; i < rainFall.length ; i ++)
        {
            if (rainFall[i] < min)
            {
                min = rainFall[i];
                minIndex = i;
            }
        }
        System.out.println(months[minIndex] 
                + " had the lowest rainfall of " 
                + rainFall[minIndex]);

        // Assign the color array
        for(int i = 0 ; i < rainFall.length ; i ++)        
        {
            colors[i] =(int) random(0, 255);
        }
    } 

    void drawBarChart()
    {
        colorMode(HSB);
        textAlign(LEFT, CENTER);
        
        float h = height / (float) rainFall.length;        
        for(int i = 0 ; i < rainFall.length ; i ++) 
        {
            noStroke();
            fill(colors[i], 255, 255);
            rect(0, map(i, 0, rainFall.length, 0, height), rainFall[i] * 2, h);
            fill(255);
            float textY = map(i, 0, rainFall.length, h * 0.5f, height + (h * 0.5f));//i * h + (h * 0.5f);
            text(months[i], 5, textY);
        }       
    }

    void drawLineGraph()
    {
        float gap = width * 0.1f;
        stroke(255);
        line(gap, gap, gap, height - gap);
        line(gap, height - gap, width - gap, height - gap);

        textAlign(CENTER, CENTER);
        for (int i = 0 ; i < months.length ; i ++)
        {
            float x = map(i, 0, months.length - 1, gap, width - gap);
            line(x, height - gap, x, height - gap + 5);
            fill(255);
            float ty = height - (gap / 2);
            text(months[i], x, ty);
        }
        for(int i = 0 ; i <= 150; i +=10)
        {
            float y = map(i, 0, 150, height - gap, gap);
            line(gap - 5, y, gap, y);
            text(i, gap / 2, y);
        }
        for(int i = 1 ; i < rainFall.length ; i ++)
        {
            float x1 = map(i - 1, 0, rainFall.length - 1, gap, width - gap); 
            float y1 = map(rainFall[i - 1], 0, 150, height - gap, gap);
            float x2 = map(i, 0, rainFall.length - 1, gap, width - gap); 
            float y2 = map(rainFall[i], 0, 150, height - gap, gap);
            line(x1, y1, x2, y2);            
        }
    }

    void drawPieChart()
    {
        float cx = width / 2;
        float cy = height / 2;

        float w = width * 0.8f;
        //arc(cx, cy, w, w, 0, TWO_PI, ARC);

        float total = 0;
        colorMode(HSB);
        for (int i = 0 ; i < rainFall.length ; i ++)
        {
            total += rainFall[i];
        }

        float runningSum = 0;
        for (int i = 0 ; i < rainFall.length ; i ++)
        {
            float next = runningSum + rainFall[i];
            float start = map(runningSum, 0, total, 0, TWO_PI);
            float end = map(next, 0, total, 0, TWO_PI);
            fill(map(i, 0, rainFall.length, 0, 255), 255, 255);
            arc(cx, cy, w, w, start, end, ARC);
            runningSum = next;
        }

    }



    public void draw()
    {
        background(0);

        //drawLineGraph();;
        drawPieChart();
        //drawBarChart();

        /*float gap = height / (float) rainFall.length;
        int m = (int) Math.floor(mouseY / gap);
        fill(255);
        text(rainFall[m], 300, height / 2);
        */
    }
>>>>>>> 19a6f5a99abdf58c9970cdcecdc798dd8322dcac
}