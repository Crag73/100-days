let form=document.querySelector(".myForm");

form.addEventListener("submit", function(ev) {
    ev.preventDefault();
    let input = document.querySelector("#inp");
    let value = input.value;
    console.log(value);
    additem(value);
    input.value = "";
});

function additem(value){
    let ul=document.querySelector(".task")
    let li=document.createElement("li");
    li.classList.add("listItem");
    li.innerHTML=`${value}`;
    ul.append(li);
}