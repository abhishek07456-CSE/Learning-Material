//finite check wether is finit or not
{
let a = 1;
let b = 0;
if(isFinite(a/b))
 console.log("yes");
}

{
    /*
     -for of iterate over value
     -for in iterate over key

    */
let a = "hee;;o";
  for(let char of a){
      console.log(char);
  }
  console.log("for of -----")
  for(let char of a){
    console.log(char);
  }
  console.log("for in -----")
  for(let char in a){
    console.log(char);
  }

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


}
