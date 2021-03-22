How the Internet works? What happens when we press enter on the browser?

1. You type maps.google.com(Uniform Resource Locator) into the address bar of your browser and press enter.
2. Every URL has a unique IP address associated with it. The mapping is stored in Name Servers and this procedure is called Domain Name System.
3. The browser checks its cache to find the IP Address for the URL.
 - If it doesn't find it, it checks its OS to find the IP address (gethostname);
 - It then Checks the router's cache.
 - It then checks the ISP's cache. If it is not available there the ISP makes a recursive request to different name servers.
4. It Checks the **com** name server (we have many name servers such as 'in', 'mil', 'us' etc) and it will redirect to google.com 
5. google.com name server will find the matching IP address for maps.google.com in its’ DNS records and return it to your DNS recursor which will send it back to your browser.
6. Browser initiates a TCP connection with the server.It uses a three way handshake 
	- Client machine sends a SYN packet to the server over the internet asking if it is open for new connections.

	- If the server has open ports that can accept and initiate new connections, it’ll respond with an ACKnowledgment of the SYN packet using a SYN/ACK packet.

	- The client will receive the SYN/ACK packet from the server and will acknowledge it by sending an ACK packet.
Then a TCP connection is established for data transmission!
7. The browser will send a GET request asking for maps.google.com web page. If you’re entering credentials or submitting a form this could be a POST request.
8. The server sends the response.
9. Once the server supplies the resources (HTML, CSS, JS, images, etc.) to the browser it undergoes the below process: <br>
**Parsing -** HTML, CSS, JS  <br>
**Rendering -** Construct DOM Tree → Render Tree → Layout of Render Tree → Painting the render tree <br>
10. The rendering engine starts getting the contents of the requested document from the networking layer. This will usually be done in 8kB chunks.<br>
11. A DOM tree is built out of the broken response. <br>
12. New requests are made to the server for each new resource that is found in the HTML source (typically images, style sheets, and JavaScript files). <br>
13. At this stage the browser marks the document as interactive and starts parsing scripts that are in "deferred" mode: those that should be executed after the document is parsed. The document state is set to "complete" and a "load" event is fired. <br>
14. Each CSS file is parsed into a StyleSheet object, where each object contains CSS rules with selectors and objects corresponding CSS grammar. The tree built is called CSSCOM. <br>
15. On top of DOM and CSSOM, a rendering tree is created, which is a set of objects to be rendered. Each of the rendering objects contains its corresponding DOM object (or a text block) plus the calculated styles. In other words, the render tree describes the visual representation of a DOM. <br>
16. After the construction of the render tree it goes through a "layout" process. This means giving each node the exact coordinates where it should appear on the screen. <br>
17. The next stage is painting–the render tree will be traversed and each node will be painted using the UI backend layer. <br>
18. Repaint: When changing element styles which don't affect the element's position on a page (such as background-color, border-color, visibility), the browser just repaints the element again with the new styles applied (that means a "repaint" or "restyle" is happening). <br>
19. Reflow: When the changes affect document contents or structure, or element position, a reflow (or relayout) happens. <br>


Explain Protocols:

Stateless vs Stateful Protocol
In computing, a stateless protocol is a communications protocol in which no information is retained by either sender or receiver, meaning that they are agnostic of the state of one another. The sender transmits a packet to the receiver and does not expect an acknowledgment of receipt. A UDP connectionless session is a stateless connection. HTTP is the other example.

Stateful Protocol
 
Why HTTP is said to be a stateless Protocol?