export let a:number=10;

export function isLegal(age:number):boolean{
    if(age>=18){
        return true;
    }
    return false;
}


function getName(name:string){
    return name;
}

export default getName;