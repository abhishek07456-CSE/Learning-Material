/*
  iterate over key like obj , map
  iterate over value - forof like array string over value

*/

let obj = {name : "abhishek" , age : 18};
  console.log(obj);
  console.log("for in -----")
  //object.keys
  //object.values
  //object.entries
  for(let key in obj){
   console.log(`${key} : ${obj[key]}`);
  }
  console.log("for in -----")

  for(let char of Object.entries(obj)){
     const [key , value] = char;
    console.log(value);
  }