/*
  -  here we calculating area , diameter and radius with different function
  -  Next we make common function if code same and some logic is differ
  -  Next how to it to map
  -  Add in prototype of array
*/

    function BurstWayToCode(){
      radius = [1,2,3,4];
      return {
        calculateArea : () => {
            output = [];
            radius.forEach(element => {
              output.push(Math.PI * Math.pow(2,element));
            });
            return output;
        },
        calculateDiameter : () => {
          output = [];
          radius.forEach(element => {
            output.push(2*element);
          });
          return output;
       }
      }
    }
    console.log("Method worst way code : \n");
    console.log(BurstWayToCode().calculateArea());
    console.log(BurstWayToCode().calculateDiameter());




  /*
     here diameter and calculate area having common code then we need to write same code again and again , we can use callback
  */
     function BestWayToCode(){
      radius = [1,2,3,4];
      return {
        areaFormula : (radius) => {
            return Math.PI * Math.pow(2,radius);
        },
        DiameterFormula : (radius) => {
          return 2 *  radius;
        },
        commonMethod : (callback) => {
            output = [];
            radius.forEach(element => {
              output.push(callback(element));
            });
            return output;
        }
      }
    }
    console.log("\n\nMethod best way code : \n");
    best_way = new BestWayToCode()
    console.log(best_way.commonMethod(best_way.areaFormula));
    console.log(best_way.commonMethod(best_way.DiameterFormula));




    /* how to map  */
    console.log("\n\nfunction mapping");
    radius = [1,2,3,4];
    console.log(radius.map(best_way.areaFormula));
    console.log(radius.map(best_way.DiameterFormula));
    /* LET CREATE OWN CUSTOM MAPPING FUNCTION*/

    console.log("\n custom own mapping");

   Array.prototype.customCalculator = function(callback){
       output = [];
       this.forEach((value) => {
          output.push(callback(value));
       });
      return output;
   }
   console.log([1,2,3,4].customCalculator(best_way.areaFormula)); // look like radius.map(best_way.DiameterFormula)
