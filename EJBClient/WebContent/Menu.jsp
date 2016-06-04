<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="Css/menu.css"/>
	<title>XBank</title>
</head>
<body>
	<h2>Welcome <s:property value="username"/><s:a theme="simple" cssStyle="text-decoration: none;margin-left: 88px;">    Đăng xuất</s:a></h2>
	<!-- 
	<s:div cssClass="drDown">
		<s:label cssClass="drLabel" value="Hệ thống"></s:label>
		<s:div cssClass="drDownContent">
			<s:a>Hạn mức đăng ký phê duyệt</s:a>
		</s:div>
	</s:div>
	 
	<div>
		<form action="acMenu" style="width:51%">
			<table>
				<tbody>
					<tr>
						<td> 
							<label>Số GD</label>
						</td>
						<td colspan="1">
							<input type="text" size="20"/>
							<label>Ngày thanh toán</label>
							<input type="text" size="15"/>
						</td>
					</tr>
					<tr>
						<td>
							<label>Khách hàng</label>
						</td>
						<td colspan="1">
							<input type="text" size="12"/>
							<input type="text" size="28"/>
							<label>CMND</label>
							<input type="text" size="15"/>
						</td>
					
					</tr>
					<tr>
						<td>
							<label>Loại tiền</label>
						</td>
						<td colspan="1">
							<select>
								<s:property value="renderedHTML" escape="false"/>
							</select>
							<label>Số tiền</label>
							<input type="text" readonly="true" value="0.00" size="11"/>
							<label>TM</label>
							<input type="text" readonly="true" value="0.00" size="11"/>
							<label>CK</label>
							<input type="text" readonly="true" value="0.00" size="11"/>
						</td>
					</tr>
					<tr>
						<td>
							<label>Diễn giải</label>
						</td>
						<td>
							<textarea rows="3" style="resize:none;width:100%"></textarea>
						</td>
					</tr>
					<tr>
						<td>
							<label>TB lỗi CN</label>
						</td>
						<td>
							<input type="text" style="width:100%"/>
						</td>
					</tr>
					<tr>
						<td>
							<label>TB lỗi QTNV</label>
						</td>
						<td>
							<input type="text" style="width:100%"/>
						</td>
					</tr>
									<tr>
						<td>
							<label>TB lỗi TGĐ</label>
						</td>
						<td>
							<input type="text" style="width:100%"/>
						</td>
					</tr>
				</tbody>
			</table>
			<fieldset>
				<legend>Thông tin tài khoản</legend>
				<table cellpadding="5">
					<tbody>
						<tr>
							<th>
								Số TK
							</th>
							<th>
								Loại tiền
							</th>
							<th>
								Số dư
							</th>
							<th>
								Lãi suất
							</th>
							<th>
								Số tiền đề nghị
							</th>
							<th>
								Nguồn gốc
							</th>
						</tr>
						<tr>
							<td>
								<input type="text" readonly="true" style="width:100%"/>
							</td>
							<td>
								<input type="text" readonly="true" style="width:100%"/>
							</td>
							<td>
								<input type="text" readonly="true" style="width:100%"/>
							</td>
							<td>
								<input type="text" readonly="true" style="width:100%"/>
							</td>
							<td>
								<input type="text" readonly="true" style="width:100%"/>
							</td>
							<td>
								<input type="text" readonly="true" style="width:100%"/>
							</td>
						</tr>
					</tbody>
				</table>
			</fieldset>
			<table>
				<tbody>
					<tr>
						<th>
							Người tạo
						</th>
						<th>
							Thời gian
						</th>
						<th>
							Kiểm soát
						</th>
						<th>
							Thời gian
						</th>
						<th>
							Tình trạng
						</th>
					</tr>
					<tr>
						<td>
							<input type="text" readonly="true" style="width:100%"/>
						</td>
						<td>
							<input type="text" readonly="true" style="width:100%"/>
						</td>
						<td>
							<input type="text" readonly="true" style="width:100%"/>
						</td>
						<td>
							<input type="text" readonly="true" style="width:100%"/>
						</td>
						<td>
							<select disabled="true">
								<option>Chờ duyệt</option>
								<option>Đã duyệt</option>
							</select>
						</td>
					</tr>
				</tbody>
			</table>
			<input type="button" value="Truy vấn"/>
			<input type="button" value="Tạo mới"/>
			<input type="button" value="Cập nhật"/>
			<input type="button" value="Xóa"/>
			<input type="button" value="Lưu"/>
		</form> 
	</div> -->
</body>
</html>