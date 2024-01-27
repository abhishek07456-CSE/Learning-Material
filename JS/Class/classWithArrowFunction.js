class Animal{
    name = "animal";
    constructor(){
        console.log("constructor called");
    }

    playSound(){
      setTimeout(()=>{
        console.log(this.name); // sournding is class then this.name accessible
      },1000)
    }
}

new Animal().playSound();

function Animal1(){
    let name = "hello";
    return  () => {
        setTimeout(()=>{
          console.log(this.name); //this refere here surround i.e gobal oject
        },1000)
      }
}
Animal1()();