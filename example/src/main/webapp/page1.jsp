<%@ page language="java" contentType="text/html; charset=UTF-8" 
  pageEncoding="UTF-8"%>
<!-- タグライブラリーの宣言 -->
<%@ taglib uri="/struts-tags" prefix="s" %> <!-- Struts2用のカスタムタグが<s:〇〇>というようなプレフィックスで利用可能になる。 -->
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
  <title>Insert title here</title>
</head>
<body>
    テキストを入力:
    <s:form method="post" action="action1.action">  <!-- httpメソッドとアクションを指定 -->
      <!-- <s:〇〇>というStruts2のカスタムタグで用意されたもののvalueは、フォーム送信時、アクションクラスに用意されたkey名のフィールドにアクセサを通じて保管される -->
      <s:label label="Message" key="text1" /><br />   
      <s:textfield label="Field" key="field1" /><br />
      <s:submit value="submit" />
    </s:form>
</body>
</html>