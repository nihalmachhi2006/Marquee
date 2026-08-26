// function parent() {
//     return function child(){
//     console.log("hello");
// };
// }
// // let x parent();
// // console.log(x);
// // console.log(parent);
// //lexical scope

let name = {
  fname: "Nihal",
  lname: "Machhi",
};
let name2 = {
  fname: "mihir",
  lname: "Machhi",
};

function sayhello() {
  console.log("hello", this.fname);
}

sayhello.call(name);
console.log(typeof name);

