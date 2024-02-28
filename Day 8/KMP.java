/**
 * KMP
 */
public class KMP {

    public static void prefix(String pattern,int lps[]){
        int len=0;
        int i =1;
        lps[0]=0;
        while(i<lps.length){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        String text="maahiahimaahima";
        text=text.replaceAll(" ", "");
        String pattern="maahi";
        int lps[]=new int[pattern.length()];
        prefix(pattern, lps);
        System.out.println();
        int i=0;
        int j=0;
        while((text.length()-i)>=(pattern.length()-j)){
            if(pattern.charAt(j)==text.charAt(i)){
                j++;
                i++;
            }
            if(j==pattern.length()){
                System.out.println("Found pattern "+pattern+" at index " + (i - j));
                j = lps[j - 1];
            }
            else if(i<text.length() && pattern.charAt(j)!=text.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i=i+1;
                }
            }
        }

    }
}