/*
- A callback is a function passed as an argument to another function.
- Used to run code sequentially to handle asynchronous call
-disadvantage
  -pyramid of droom created
  -nested callback , not easy to read and maintable to handle this promised used

*/
let result;
const evaluation = (a,b) => {
    setTimeout(()=>{
        result = a + b;
    },5000)
}
const evaluationCallback = (a,b,dis) => {
    setTimeout(()=>{
        result = a + b;
        dis();
    },5000);
}
const displayResult = () => {
    console.log(result);
}

// evaluation(1,2);
// displayResult();//display undefined
evaluationCallback(1,2,displayResult);



