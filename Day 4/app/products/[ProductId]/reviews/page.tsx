export default function Review({ params }:{
    params:{
        ProductId:number
    }
}){
    return(<h1>Reviews of the product {params.ProductId}</h1>)
}