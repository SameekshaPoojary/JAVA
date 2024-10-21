public class KannadaMovies 
{
    public static void main(String[] args) 
    {

        
        String movie1 = "KGF";
        String movie2 = "Kantara";
        String movie3 = "Ulidavaru Kandanthe";
        String movie4 = "Mungaru Male";
        String movie5 = "Rajakumara";
        String movie6 = "Tagaru";
        String movie7 = "Gaalipata";
        String movie8 = "James";
        String movie9 = "Love Mocktail";
        String movie10 = "Roberrt";

        
        String movie11 = new String("KGF");
        String movie12 = new String("Kantara");
        String movie13 = new String("Ulidavaru Kandanthe");
        String movie14 = new String("Mungaru Male");
        String movie15 = new String("Rajakumara");
        String movie16 = new String("Tagaru");
        String movie17 = new String("Gaalipata");
        String movie18 = new String("James");
        String movie19 = new String("Love Mocktail2");
        String movie20 = new String("Roberrt");

       System.out.println(movie1.equals(movie11));
       System.out.println(movie9.equals(movie19));

       char[] reversedArray=movie1.toCharArray();

       for(int i=0;i<reversedArray.length;i++)
       {
       	System.out.println(reversedArray[i]);
       }

       for (int i = reversedArray.length - 1; i >= 0; i--) 
       {
            System.out.print(reversedArray[i]);  
       
       }
        
    }

   

}


