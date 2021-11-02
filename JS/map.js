/*
  store element in key value pairs
*/

Map = new Map([["section A",[1,2,3,4,5]], ["section B",[4,5,6,7,8]]]);
console.log(Map);
console.log(Map.has("section C"));
console.log(Map.get("section C"));
Map.set("section C",[4,5,6,7,8]);
console.log(Map.get("section C"));
console.log(Map.has("section C"));
console.log(Map.values());
console.log(Map.keys());
console.log(Map.entries());
console.log(Map.delete("section A"));//true
console.log(Map.delete("section k"));//false

for(let element of Map[Symbol.iterator]()){
    console.log(Map.get(element[0]));
}


