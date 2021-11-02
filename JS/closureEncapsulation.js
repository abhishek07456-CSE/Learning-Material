/*
  encapsulation - bind data and function together,so that it not used outside world
  abstraction - hide the implementation details

*/

function car(){
      let speed = 0; //private
      let fuel = 80; // not more used so it garbage collected
      return {
           speedUp : () => {
               debugger
              speed++;
              console.log(`speed up - ${speed}`);//closure of car

          },
          slowDown  : () => {
            speed--;
            console.log(`speed down - ${speed}`);  //closure of car

          },
          stopCar : () => {
            speed = 0;
            console.log(`speed stop`);  //closure of car
          }
      }
}
function truck(){
    let speed = 0; //private
}
console.log("car 1");
car1 = new car(); // or carSpeed()
car1.speedUp();
car1.speedUp();
car1.speedUp();
car1.slowDown();
car1.stopCar();

console.log("car 2");

car2 = new car(); // or carSpeed()
car2.speedUp();
car2.speedUp();
car2.speedUp();
car2.slowDown();
car2.stopCar();

console.log("---truck--");

truck = new truck();
car1.speedUp.bind(truck)();
car1.speedUp.call([truck]);