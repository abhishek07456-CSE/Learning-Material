package Data_Structure.Stack;

import java.util.Stack;

public class simplifyDirectory {
    public static String simplifyPath(String path) {
        Stack <String> stack = new Stack <String> ();
        int i = 0;
        String directory = "";
        path = path +"/"; //used for like path = "/a" so it become /a/ here we get directory name between two slashes
        int l = path.length();
        while( i < l){
              if(path.charAt(i) == '/'){
                   if(directory.equals("..")) { // move back to directory previous  so pop top directory (/a/../b/c= > /a/c)
                      if(!stack.empty())
                       stack.pop();
                   }else if(!directory.equals("")){
                     if(!directory.equals(".")) // current directory like /a/./b/c => /a/b/c
                       stack.push(directory);
                   }
                  directory = ""; //empty director after new slash
              }else{
                  directory += path.charAt(i); // get directory name till next slash so become directory name
              }
            i++;
         }
         path = "";
         while(!stack.empty()){
             path = '/'+stack.pop() +path; //make final path
         }
         return path.equals("") ? "/" : path ;
     }
    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/b/./c/../d"));
        /*
           cd a/b/c
           cd ./ (path = /a/b/c)
           cd .. (path = /a/b)
           cd /d (path = /a/b/d)

        */
    }
}
