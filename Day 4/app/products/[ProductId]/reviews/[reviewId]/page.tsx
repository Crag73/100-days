import { notFound } from "next/navigation";

export default function ReviewDetail({ params }:{
    params:{
        reviewId:number,
        ProductId:number
    }
}){
    if(params.reviewId > 1000){
        notFound();
    }
    return(<h1>
        Review {params.reviewId} for product {params.ProductId}
    </h1>)
}