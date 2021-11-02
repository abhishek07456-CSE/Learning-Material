/*

-lexical environment call stack created for very function call , it track all local variable and track of it parent closure

-closure remembers’ the environment in which it was created.
-js is smart engine if no variable of parent in its child or variable override then no closure is formed
  parent(){
      let a;
      child(){
          lat b; // no clousre of parent is created
      }
  }
   parent(){
      let c;
      child(){
          lat b; // no closure of parent is created c having no longer user
      }
  }
    parent(){
      let c;
      child(){
          let b;
          console.log(c) ; here use of c so closure of c is used
      }
  }
      parent(){
      let c;
      child(){
          let b;
          subChild(){
             console.log(c) ;even if child is not used c but subChild used then closure of parent is formed in child
          }
      }
  }
- conclusion if parent variable is used if child or subChild function then closure parent clousre hire's formed till its use
Advantage
- inner function have access to its parents
- By using a closure we can have private variables that are available even after a function task is finished.
- With a function closure we can store data in a separate scope, and share it only where necessary.

Disadvantage
- as long as closure active the variable not garbage collected eg . Parent inside(var a) - > child(access a) -> sub-child(access a) (so here a not garbage collected when closure active)
- If there come a point in you program where you are done using closure then you need to set closure to null.
- closure consume more memory as it track its parent closure as well

*/
function grandparent(){
    let name = "grandparent"; // private not accessible outside world
    let bk  = 2;
    console.log("grand parent called");
    function parent(){
        // bk = null; //garbage collected auto by js from here bk not used anymore
        console.log("parent called");
        let name = "parent";
        // child(); // Hoisting created all function variable are defined in top of scope
        function child(){
            debugger
            console.log(bk);
            console.log("child called");
            // let name = "child"; // if this not find then check in parent closure if also not find in parent then check in grandparent then main
            console.log(name);
        }
        return child;
    }
    return parent;

}
grandparent()()();
/*
grandparent() return parent
parent()() =>return child;
child()

*/
