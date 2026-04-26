package interview_Coding;

public class RemoveFrst_Lst_LtrFrm_StringArray_62 {
	public static void main(String args[])
	{
		//Only remember replace() & replaceFirst() methods are important **
		//Remove the Last  letter
		String str[] = {"Applea", "Autoa", "Alphaa"};

		for (int i = 0; i < str.length; i++) {
			if (str[i].endsWith("a")) {
				str[i] = str[i].substring(0, str[i].length() - 1);
			}
		}

		for (String s : str) {
			System.out.println(s);
		}
//=====================================================================================================================
		//Using replace method
		//Remove the Last  letter
		
		/*String str[] = {"Applea", "Autoa", "Alphaa"};

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceFirst("a$", ""); a → the character a, $ → end of the string   //"a$" → means 'a' at the end of string
        }                                                                        //replaceFirst("a$", "") → removes only the last 'a'

        for (String s : str) {                                   //Enhanced for loop to iterate over the modified array.
            System.out.println(s);
        }*/
//=====================================================================================================================
		//Remove the First letter
		/* String str[] = {"Applea", "Autoa", "Alphaa"};

        for (int i = 0; i < str.length; i++) {
            String remove = str[i].replace("A", "");
            System.out.println(remove);
        }*/
//=====================================================================================================================
		//Remove the First letter
		/*String str[] = {"Applea", "Autoa", "Alphaa"};

        for (int i = 0; i < str.length; i++) {          //str.length` is `3`, so the loop runs 3 times.
            str[i] = str[i].replaceFirst("^.", ""); // remove first character , str[i]: accesses each string in the array.
        }                                                                      //^ → start of the string
                                                                               //. → any single character
        for (String s : str) {                                  //So "^." matches the first character only, and replaces it with an empty string ("").
            System.out.println(s);
        }*/
//=====================================================================================================================
      //Remove the letter 'p'
		
		/*String str[]={"appleA","americaA","andamanA"};
       for(int i=0;i<str.length;i++)
       {
          str[i]=str[i].replaceFirst("p.","");
       }
       for(String var: str)
       {
           System.out.println(var);
       }*/

	}
}