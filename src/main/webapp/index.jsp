<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Máy tính triết khấu giá sản phẩm</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div id="content">
    <h1>Tính giá triết khấu sản phẩm</h1>
    <form method="post" action = "/calculator">
        <div id="data">
            <td>
                <tr>
                    <label>Tên sản phẩm</label>
                    <input type = "text" name="description"placeholder ="product name"/></br></br>
                </tr>
                <tr>
                    <label>Giá niêm yết</label>
                    <input type="text" name="price"placeholder ="product price"></br></br>
                </tr>
                <tr>
                    <label>Tỉ lệ triết khấu</label>
                    <input type="text" name="discount"placeholder ="discount Amount">(%)</br></br>
                </tr>
            </td>
        </div>
        <div id="button">
            <label>&nbsp;</label>
            <input type="submit" value="Nhấn vào để tính">
        </div>
    </form>
</div>
</body>
</html>