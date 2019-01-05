## **Background**
This app allows a user take a picture of food in order to find general nutritional information from the web.

[![example.png](https://i.postimg.cc/JzNWP5t3/example.png)](https://postimg.cc/fVRFbXck)
## **Functionality**
Using an embedded camera fragment, we retrieved an image from that activity. Using this image, we had to upload it to the Internet using the Imgur API. After our POST request, we took the URL we received from the JSON after posting the picture. We took this URL, and put it through the MRISA API which was put up on a server. This API would then return a single JSON with the closest match of the search and give us some information such as the title and name of the picture/food. Then with the name, we put it through the DNB API which would find the food in their database and return another JSON of the nutrition facts of the food. Parsing the JSON, we display the information for the user.

#### **_I worked on this project with Peter Soboyejo, Aaron Lam, Brian Li, and David Long.  Application was completed during PennApps XII. https://devpost.com/software/goblr-ih8a1j_** 
