function sum (a,b,c,d){
    return a+b+c+d;
}
console.log(sum(1,2,3,4)); //but if more then 4 argument

//argument object function

sum(1,2,3,4,5,6,7,8,9);
function sum(){
    // console.log(arguments.length);
    for(let i = 0 ; i < arguments.length ; i++){
        console.log(arguments[i]);
    }
}

//spread operator in es

sum2(1,2,3,4,5,6,7,8,9);
function sum2(...a){
    a.forEach((value) =>{
        console.log(value);
    })
}