function download(URL,cb){
        setTimeout(()=>{
            let downloadedfile=URL.split("/").pop();
            console.log(downloadedfile);
            cb(downloadedfile);
        },3000)
}

function compresss(file,cb){
    setTimeout(()=>{
        let zipfile=file.split(".")[0];
        console.log(zipfile);
        cb(zipfile)
    },1000)
}

function upload(zipfile,cb){
    let newURL="http://chitkara.com/"+zipfile;
    setTimeout(()=>{
        console.log("Successfully uploaded at "+newURL);
        cb("done");
    },2000)
}
download("http://chitkara.com/movie.mp4",function(d){
    compresss(d,function(z){
        upload(z,function(msg){
            console.log(msg);
        })
    })
});