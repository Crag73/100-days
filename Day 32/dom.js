const div = document.querySelector(".header");
console.log(div);
//parent
console.log(div.parentElement);
//child
let parent = div.parentElement;
console.log(parent.childNodes);
//prevSib
const h = document.querySelector("h1");
console.log(h);
let prev = h.previousElementSibling;
console.log(prev);
//nextSib
let next = h.nextElementSibling;
console.log(next);

const header3 = h.parentElement.nextElementSibling;
console.dir(header3);
//children
const head = document.querySelector("header");
let child = head.children;
console.log(child);
//ul child
const ulist = document.querySelector(".list");
console.log(ulist.children);


//adding Element in the list
console.log(ulist);
//Naive Method
let str = ulist.innerHTML;
str += '<li class="listItem">AI</li>';
ulist.innerHTML = str;

//Better Method
//1.Create element
//2.add content

let li = document.createElement("li");
li.innerText = "Digital Marketing";
ulist.prepend(li);

//Remove Child

ulist.removeChild(li);

//remove()

const fChild = ulist.firstElementChild;
console.log(fChild)
const lChild = ulist.lastElementChild;
console.log(lChild);
fChild.remove();
lChild.remove()


//Event
//1.click event

let btn = document.querySelector(".btn");
console.log(btn);
btn.addEventListener("click", eventFunction);

function eventFunction(ev) {
    console.log("event happened");
    console.log(ev);
}
function addElement(value) {
    let li = document.createElement("li");
    li.innerText = `$(value)`;
    ulist.append(li);
}

btn.addEventListener("click", addElement);

let delbtn = document.querySelector(".delete");

function removeElemenet() {
    let ulist = document.querySelector(".list");
    let lChild = ulist.lastElementChild;
    lChild.remove();
}
delbtn.addEventListener("click", removeElemenet);

let input = document.querySelector(".inp");

input.addEventListener("keypress", function (ev) {
    console.log(input.value);
    console.log(ev.key);
    console.log(ev.target.value);
})

let myForm = document.querySelector(".myForm");
myForm.addEventListener("submit", function (ev) {
    ev.preventDefault();
    let inp = document.querySelector("#inp");
    console.log(inp.value);
    addElement(input.value);
})