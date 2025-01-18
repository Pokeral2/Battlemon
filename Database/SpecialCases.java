package Database;

public class SpecialCases
{
    public static int[] MegaForms = new int [899];
    public static int[] GmaxForms = new int [899];
    public static int[] SpecialForms = new int [899];

    public static void loadSpecialCases()
    {
        //int[] MegaForms = new int[899];
        int[] targetMons = {3,6,9,15,18,65,80,94,115,127,130,142,150,181,208,212,214,229,248,254,257,260,282,302,303,306,308,310,319,323,334,354,359,362,373,376,380,381,384,428,445,448,460,475,531,719};
        for(int n:targetMons)
            MegaForms[n]=1;

        //int[]GMaxForms=new int[899];
        int[]GMaxMons={6,12,25,52,68,94,99,131,133,143,569,809,823,826,834,839,841,842,844,849,851,858,861,869,879,884,3,9,812,815,818,892};
        for(int n:GMaxMons)
            GMaxMons[n]=1;
    }   
}