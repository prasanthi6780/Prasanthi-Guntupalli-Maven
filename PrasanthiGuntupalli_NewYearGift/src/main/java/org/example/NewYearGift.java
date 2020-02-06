package org.example;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class NewYearGift implements Totalweight {
    private static Random rand = new Random();
    public static double sugar_levels[]=new double[5];
    public static double weights[]=new double[5];
    public static String names[] =new String[5];
    private static final int SUGAR_MIN = 20;
    private static final int SUGAR_MAX = 80;
    private static final int WEIGHT_MIN = 50;
    private static final int WEIGHT_MAX = 200;
    public double totalweight=0.0;
    public static double min_suglevel=0.0;
    public static double max_suglevel=0.0;

    public NewYearGift(double min, double max) {
        min_suglevel=min;
        max_suglevel=max;


    }

    public static void main(String args[]){
        double tot1=0.0;
        double tot2=0.0;
        double tot3=0.0;
        double tot4=0.0;
        double m = randomSugarLevel();
        double n = randomWeight();
        BigDecimal bd = new BigDecimal(m).setScale(2, RoundingMode.HALF_UP);
        double sugarParam = bd.doubleValue();
        BigDecimal bd1 = new BigDecimal(n).setScale(2, RoundingMode.HALF_UP);
        double weightParam = bd1.doubleValue();
        Gulabjaam gulabjaam=new Gulabjaam(sugarParam,weightParam);
        sugar_levels[0]=gulabjaam.getSugarLevel();
        weights[0]=gulabjaam.getWeight();
        names[0]=gulabjaam.getClass().getSimpleName();

        double m1 = randomSugarLevel();
        double n1 = randomWeight();
        BigDecimal bd2 = new BigDecimal(m1).setScale(2, RoundingMode.HALF_UP);
        double sugarParam1 = bd2.doubleValue();
        BigDecimal bd3 = new BigDecimal(n1).setScale(2, RoundingMode.HALF_UP);
        double weightParam1 = bd3.doubleValue();
        Khaaja khaaja=new Khaaja(sugarParam1,weightParam1);
        sugar_levels[1]=khaaja.getSugarLevel();
        weights[1]=khaaja.getWeight();
        names[1]=khaaja.getClass().getSimpleName();

        double m2 = randomSugarLevel();
        double n2 = randomWeight();
        BigDecimal bd4 = new BigDecimal(m2).setScale(2, RoundingMode.HALF_UP);
        double sugarParam2 = bd4.doubleValue();
        BigDecimal bd5 = new BigDecimal(n2).setScale(2, RoundingMode.HALF_UP);
        double weightParam2 = bd5.doubleValue();
        Laddu laddu=new Laddu(sugarParam2,weightParam2);
        sugar_levels[2]=laddu.getSugarLevel();
        weights[2]=laddu.getWeight();
        names[2]=laddu.getClass().getSimpleName();

        double m3 = randomSugarLevel();
        double n3 = randomWeight();
        BigDecimal bd6 = new BigDecimal(m3).setScale(2, RoundingMode.HALF_UP);
        double sugarParam3 = bd6.doubleValue();
        BigDecimal bd7 = new BigDecimal(n3).setScale(2, RoundingMode.HALF_UP);
        double weightParam3 = bd7.doubleValue();
        Putarekulu putarekulu=new Putarekulu(sugarParam3,weightParam3);
        sugar_levels[3]=putarekulu.getSugarLevel();
        weights[3]=putarekulu.getWeight();
        names[3]=putarekulu.getClass().getSimpleName();

        double m4 = randomSugarLevel();
        double n4 = randomWeight();
        BigDecimal bd8 = new BigDecimal(m4).setScale(2, RoundingMode.HALF_UP);
        double sugarParam4 = bd8.doubleValue();
        BigDecimal bd9 = new BigDecimal(n4).setScale(2, RoundingMode.HALF_UP);
        double weightParam4 = bd9.doubleValue();
        Rasagulla rasagulla=new Rasagulla(sugarParam4,weightParam4);
        sugar_levels[4]=rasagulla.getSugarLevel();
        weights[4]=rasagulla.getWeight();
        names[4]=rasagulla.getClass().getSimpleName();

        System.out.println("List of contents in Gift:");
        System.out.println("# Name            Sugar     Weight");
        System.out.println("- ----            -----     ------");
        for(int i=0;i<5;i++){
            System.out.printf("%-1s %-15s %-9s %-5s\n",i+1,names[i],sugar_levels[i],weights[i]);
            tot1=tot1+weights[i];
        }
        BigDecimal bd14 = new BigDecimal(tot1).setScale(2, RoundingMode.HALF_UP);
        double t4 = bd14.doubleValue();
        System.out.println("Total weight : "+t4);
        System.out.println("----------------------------------------------");
        //creating duplicate arrays for sorting
        String dupnames[]=names;
        double dupsugar_levels[]=sugar_levels;
        double dupweights[]=weights;
        //sorting sweets based on weights
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(dupweights[i]>dupweights[j]){
                    double temp=dupweights[i];
                    dupweights[i]=dupweights[j];
                    dupweights[j]=temp;
                    String temp2=dupnames[i];
                    dupnames[i]=dupnames[j];
                    dupnames[j]=temp2;
                    double temp3=dupsugar_levels[i];
                    dupsugar_levels[i]=dupsugar_levels[j];
                    dupsugar_levels[j]=temp3;
                }
            }
        }
        System.out.println("List of contents in Gift sorted by weights");
        System.out.println("# Name            Sugar     Weight");
        System.out.println("- ----            -----     ------");
        for(int i=0;i<5;i++){
            System.out.printf("%-1s %-15s %-9s %-5s\n",i+1,dupnames[i],dupsugar_levels[i],dupweights[i]);
            tot2=tot2+dupweights[i];
        }
        BigDecimal bd13 = new BigDecimal(tot2).setScale(2, RoundingMode.HALF_UP);
        double t3 = bd13.doubleValue();
        System.out.println("Total weight : "+t3);
        System.out.println("----------------------------------------------");
        //creating duplicate arrays for sorting
        String dupnames1[]=names;
        double dupsugar_levels1[]=sugar_levels;
        double dupweights1[]=weights;
        //sorting sweets based on sugar_level
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(dupsugar_levels1[i]>dupsugar_levels1[j]){
                    double temp=dupweights1[i];
                    dupweights1[i]=dupweights1[j];
                    dupweights1[j]=temp;
                    String temp2=dupnames1[i];
                    dupnames1[i]=dupnames1[j];
                    dupnames1[j]=temp2;
                    double temp3=dupsugar_levels1[i];
                    dupsugar_levels1[i]=dupsugar_levels1[j];
                    dupsugar_levels1[j]=temp3;
                }
            }
        }
        System.out.println("List of contents in Gift sorted by sugar_levels");
        System.out.println("# Name            Sugar     Weight");
        System.out.println("- ----            -----     ------");
        for(int i=0;i<5;i++){
            System.out.printf("%-1s %-15s %-9s %-5s\n",i+1,dupnames1[i],dupsugar_levels1[i],dupweights1[i]);
            tot3=tot3+dupweights1[i];
        }
        BigDecimal bd12 = new BigDecimal(tot3).setScale(2, RoundingMode.HALF_UP);
        double t2 = bd12.doubleValue();
        System.out.println("Total weight : "+t2);
        System.out.println("----------------------------------------------");
        //declaring arrays to store the sweets which have sugar_level value between given min and max sugar values.
        double mintomaxweights[]=weights;
        double mintomaxsugar[]=sugar_levels;
        String mintomaxnames[]=names;
        int j=0;
        System.out.println("List of contents having sugar level between "+min_suglevel+"and "+max_suglevel);
        System.out.println("# Name            Sugar     Weight");
        System.out.println("- ----            -----     ------");
        for(int i=0;i<5;i++) {
            if (mintomaxsugar[i] >= min_suglevel && mintomaxsugar[i] <= max_suglevel) {
                j=j+1;
                System.out.printf("%-1s %-15s %-9s %-5s\n",j, mintomaxnames[i], mintomaxsugar[i], mintomaxweights[i]);
                tot4 = tot4 + mintomaxweights[i];
            }
        }
        BigDecimal bd11 = new BigDecimal(tot4).setScale(2, RoundingMode.HALF_UP);
        double t1 = bd11.doubleValue();
        System.out.println("Total weight : "+t1);
        System.out.println("----------------------------------------------");

    }
    public static double randomWeight() {
        return WEIGHT_MIN + (Math.random() * ((WEIGHT_MAX - WEIGHT_MIN) + 1));
    }
    public static double randomSugarLevel() {
        return SUGAR_MIN + (Math.random() * ((SUGAR_MAX - SUGAR_MIN) + 1));
    }

    @Override
    public void totalWeight() {
        for(int i=0;i<5;i++){
            totalweight=totalweight+weights[i];
        }
        BigDecimal bd10 = new BigDecimal(totalweight).setScale(2, RoundingMode.HALF_UP);
        double t = bd10.doubleValue();
        System.out.println("Total NewYearGift weight is : "+t);
    }
}
