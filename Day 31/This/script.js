console.log(this);
function foo(){
    console.log(this);
}
foo();

let obj={
    name:"xyz",
    age:20,
    fun:foo
}

let obj2={
    name:"xyz2",
    age:22,
    fun:foo
}

function foo(...args){
    console.log(args[0],args[1]);
    console.log(this);
}

obj.fun();
obj2.fun();


//explict

let obj3={
    name:"xyz3",
    age:21,
}

//1.call();


foo.call(obj3);

let arr=["Cricket","Hockey"];

foo.call(obj3,arr[0],arr[1]);

//2.apply

foo.apply(obj3,arr);

//3.bind

let xyz=foo.bind(obj3);

console.log(xyz);

function fun(cb){
    cb();
}
//fun(foo.call(obj3));  Wrong

fun(xyz);

let obj4={
    fun:function(){
        function foo(){
            console.log(this);
        }
        foo();
    }
}

obj4.fun();