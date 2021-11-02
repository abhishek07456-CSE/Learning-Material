// function myStartFunction() {
//     myVar = setTimeout(alertFunc, 2000, "First parameter", "Second parameter");
//   }
  
//   function alertFunc(param1, param2) {
//     document.getElementById("demo").innerHTML += "Hello ";
  
//     document.getElementById("demo2").innerHTML = "Parameters passed to alertFunc(): <br>" 
//     + param1 + "<br>" + param2 + "<br>";
//   }

setTimeout(() => {console.log(`video 1 recorded after 2000`); },2000);
setTimeout(() => {console.log(`video 2 recorded after 1000`); },1000);
setTimeout(() => {console.log(`video 3 recorded after 3000`); },3000);

// Promise.all([video1,video2,video3]).then((messages) =>{
//     console.log(messages);
// }).catch((messages)=>{
//     console.log(messages);
// });