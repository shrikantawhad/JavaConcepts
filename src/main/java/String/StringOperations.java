package String;

public class StringOperations {
    public static void main(String[] args) {
        char ch[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String str = new String(ch);
        String str2 = new String(ch);
        str2 = "Hello World Programuu A Miner Change";


        System.out.println(str.charAt(str.length() - 1));

        //Printing Even Position Character
        for (int i = 0; i <= str2.length() - 1; i++) {
            if (i % 2 == 0) {
                System.out.print(str2.charAt(i));
            }
        }

        //Getting Particular Character Count
        int count = 0;
        for (int j = 0; j <= str2.length() - 1; j++) {
            if (str2.charAt(j) == 'o') {
                count++;
            }
        }

        String[] str3 = str2.split("o", 3);
        System.out.println(str3[1]);


        //Vowels Count from the given String
        System.out.println("Count of O : " + count);
        char[] vowels={'a','e','i','o','u'};
        int length = vowels.length;
        System.out.println("Vowels length : "+length);
        str2=str2.toLowerCase();
        int VowelsCount=0;
        for (int k = 0; k <= str2.length() - 1; k++) {
            for (int s=0;s<=length-1;s++) {
                if (str2.charAt(k) == vowels[s]) {
                    VowelsCount++;
                }
            }
        }
        System.out.println("Vowels Count : "+VowelsCount);

    }

    


}
