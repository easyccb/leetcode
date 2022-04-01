package prefix;

/**
 * 最长公共前缀
 * 纵向比较
 */
public class LongestCommonPrefix {

    public String say(String[] strs){
        if (strs==null || strs.length==0) return "";

        int count=strs.length;

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < count; j++) {
                if (strs[j].length()==i || strs[j].charAt(i)!=c ){
                    return strs[0].substring(0,i);
                }
            }
        }

        return strs[0];
    }

}
