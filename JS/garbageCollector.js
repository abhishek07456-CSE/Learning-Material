let fruit = {
     "name" : "orange",
}
let  orange = fruit;

/*

         name
        /   \
    fruit    orange

*/

fruit = null;

/*

         name
             \
    fruit    orange
name still access by orange i.e name is exist in memory and not collected by garbage collector
*/
// console.log(fruit.name);
console.log(orange.name);

.A...CDE.

112343456
