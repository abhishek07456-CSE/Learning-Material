/*

- due to callback hell promise introduced in ES6 
JavaScript promises can be in one of three possible states. These states indicate the progress of the promise. They are:

pending: This is the default state of a defined promise
fulfilled:  This is the state of a successful promise
rejected: This is the state of a failed promise


The first argument of .then is a function that runs when the promise is resolved and receives the result.

The second argument of .then is a function that runs when the promise is rejected and receives the error.

*/



const p1 = new Promise((resolve , reject) => {
    resolve("working fine");
})

p1.then(
    (success)=> {
      console.log("success executed")
    },
    (failure) => {
        console.log("failure executed")
    }
)

const p2 = new Promise((resolve , reject) => {
    reject(new Error("Failed"));
})

p2.then(
    (success)=> {
      console.log("success executed")
    },
    (failure) => {
        console.log(failure.message)
    }
);


