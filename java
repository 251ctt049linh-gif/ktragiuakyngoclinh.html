function welcome()
{
    alert("Chào mừng bạn đến Mobile Store Ngọc Lĩnh!");
}

function buy(phone)
{
    alert("Bạn đã chọn mua " + phone);
}

function changeColor()
{
    if(document.body.style.background == "lightyellow")
    {
        document.body.style.background = "#f5f5f5";
    }
    else
    {
        document.body.style.background = "lightyellow";
    }
}