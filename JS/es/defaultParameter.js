/*
value assigned left to right
-default value is given some variable  then all variable in right must be default param
*/

function sum(a,b=2){
    return a+b;
}
console.log(sum(1));
console.log(sum(1,3));