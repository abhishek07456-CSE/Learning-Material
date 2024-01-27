/*

promise.race return first which settled fast i.e either reject or fullfil;
promise.any return first that first fullfil only
*/

let promise1 = new Promise((resolve,reject)=>{
       setTimeout(()=>{
           resolve("promise 1");
       },2000);
});

let promise2 = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve("promise 2");
    },501);
});

let promise3 = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        reject(new Error('promise 3'));
    },500);
})

Promise.race([promise1, promise2 , promise3]).then((value) => {
    console.log("Race : The single promise it returns is the fastest promise to finish running—resolved or not.")
    console.log(value); // return first resolved
}).catch(reason => {
    console.log("Race : The single promise it returns is the fastest promise to finish running—resolved or not.")
    console.log(reason.message); 
})


Promise.any([promise1, promise2 , promise3]).then((value) => {
    console.log("Ant : The single promise it returns is the first resolved only")
    console.log(value); // return first resolved
}).catch(reason => {
    console.log("Any : never comer here,return only success one")
    console.log(reason.message); 
})


Promise.allSettled([promise1, promise2 , promise3]).then((result) => {
    console.log("\n\nallSettled : it shows the outcome of all the promises in the array regardless of the status—resolved or rejected.")
   result.forEach((value)=>{console.log(value)});
});


Promise.all([promise1, promise2 , promise3])
.then((result) => {
    console.log("\n\all: it shows the outcome untile all promise not resolved")
   result.forEach((value)=>{console.log(value)});
})
.catch((reason) => {
    console.log("\n\all: if any of fail then it stops");
    console.log(reason)
})