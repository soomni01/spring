<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--  element명 tab --%>
<h1></h1>
<p></p>
<div></div>

<%-- p+div  --%>
<p></p>
<div></div>

<%-- h1+p --%>
<h1></h1>
<p></p>

<%-- h1+h2+h3 --%>
<h1></h1>
<h2></h2>
<h3></h3>

<%-- div>p --%>
<div>
    <p></p>
</div>

<%-- h1>span --%>
<h1>
    <span></span>
</h1>
<h1>
    <span></span>
</h1>

<%-- # --%>
<%--h1#head1--%>
<h1 id="head1"></h1>

<%--h1#head2>p#para1--%>
<h1 id="head2">
    <p id="para1"></p>
</h1>

<%--h1#head3+h2#sub1--%>
<h1 id="head3"></h1>
<h2 id="sub1"></h2>

<%--div#box1--%>
<div id="box1"></div>

<%-- . --%>
<%--h1.head--%>
<h1 class="head"></h1>
<%--h1.head.note--%>
<h1 class="head note"></h1>
<%--h1#head01.error.note--%>
<h1 id="head01" class="error note"></h1>

<%-- [] --%>
<%--h1[title]--%>
<h1 title=""></h1>

<%--h1[title="my head"]--%>
<h1 title="my head"></h1>

<%--input[value="hello"][name="message"][title="input"]--%>
<input type="text" value="hello" name="message" title="input">

<%-- * --%>
<%--p*3--%>
<p></p>
<p></p>
<p></p>
<%--tr*2--%>
<tr></tr>
<tr></tr>

<%--table>tr*3>td*4--%>
<table>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
</table>

<%-- ^ --%>
<%--div>h1>span+p--%>
<div>
    <h1>
        <span></span>
        <p></p>
    </h1>
</div>
<%--div>h1>span^p--%>
<div>
    <h1>
        <span></span>
    </h1>
    <p></p>
</div>

<div>
    <h1>
        <span></span>
    </h1>
    <p></p>
</div>

<%--table>thead>tr>th*4^^tbody>tr*3>td*4--%>
<table>
    <thead>
    <tr>
        <th>apple</th>
        <th>iphone</th>
        <th>samsung</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    </tbody>
</table>

<%-- lorem --%>
Lorem ipsum dolor sit amet, consectetur adipisicing elit. Atque dignissimos fuga ipsa molestias quas quidem. A at
cumque, dolores ipsa minima nemo odit officia recusandae repudiandae sequi, ullam vero voluptatem.

<%-- lorem3 --%>
Lorem ipsum dolor.

<%-- lorem5 --%>
Lorem ipsum dolor sit amet.

<%--lorem1--%>
Lorem.

<%--table>thead>tr>th*4>lorem1^^^tbody>tr*3>th*4>lorem1--%>
<table>
    <thead>
    <tr>
        <th>Lorem.</th>
        <th>Non?</th>
        <th>Officia.</th>
        <th>Quisquam!</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th>Lorem.</th>
        <th>Quidem!</th>
        <th>Reiciendis.</th>
        <th>Non!</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Nesciunt.</th>
        <th>Maxime?</th>
        <th>Obcaecati.</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Id.</th>
        <th>Mollitia?</th>
        <th>Eum!</th>
    </tr>
    </tbody>
    <tbody>
    <tr>
        <th>Lorem.</th>
        <th>Ut!</th>
        <th>Autem!</th>
        <th>Dolorem!</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Odit!</th>
        <th>Neque.</th>
        <th>Cumque?</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Tempore.</th>
        <th>Deleniti.</th>
        <th>Molestias?</th>
    </tr>
    </tbody>
    <tbody>
    <tr>
        <th>Lorem.</th>
        <th>Labore?</th>
        <th>Placeat.</th>
        <th>Aliquam?</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Sint!</th>
        <th>Omnis.</th>
        <th>At.</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Quasi!</th>
        <th>In!</th>
        <th>Sequi.</th>
    </tr>
    </tbody>
    <tbody>
    <tr>
        <th>Lorem.</th>
        <th>Possimus.</th>
        <th>Quod?</th>
        <th>Nesciunt.</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Odit.</th>
        <th>Officia!</th>
        <th>Modi.</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Nobis?</th>
        <th>Error?</th>
        <th>Eos!</th>
    </tr>
    </tbody>
</table>

<%--$--%>
<%--h1#header$*3--%>
<h1 id="header1"></h1>
<h1 id="header2"></h1>
<h1 id="header3"></h1>

<%--h1.note$*3--%>
<h1 class="note1"></h1>
<h1 class="note2"></h1>
<h1 class="note3"></h1>

<%--{}--%>
<%--h1{hello world}--%>
<h1>hello world</h1>

<%--div{$}*5--%>
<div>1</div>
<div>2</div>
<div>3</div>
<div>4</div>
<div>5</div>

<%-- () --%>
<%--(h1>p)*3--%>
<h1>
    <p></p>
</h1>
<h1>
    <p></p>
</h1>
<h1>
    <p></p>
</h1>

</body>
</html>