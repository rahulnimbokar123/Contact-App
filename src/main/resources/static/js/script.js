console.log("script loaded");

let currentTheme=getTheme();
changeTheme(currentTheme)

//todo

function changeTheme(){
    //set web page
    document.querySelector('html').classList.add(currentTheme);
//set listener to change theme button
    const changeThemeButton =document.querySelector('#theme_change_button')
    changeThemeButton.addEventListener("click",(event)=>{
        console.log("change Theme Button clicked");
    });
}
//set theme to local
function setTheme(theme){
    localStorage.setItem("theme",theme);

}

//get theme from localstroage
function getTheme(){
    let theme=localStorage.getItem("theme")
    if(theme) return theme;
     else return "light" ;
}