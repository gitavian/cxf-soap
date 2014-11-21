cxf-soap
========
File uploading web service built with Apache CFX

A solution for sending large attachment with SOAP messages by using MTOM (SOAP Message Transmission Optimization Mechanism) which encodes binary data in base64Binary and sends the data as binary attachment rather than keeping it with actual SOAP message.

This example uses cxf version 2.3.0 (if you try this with a newer version you should consider cxf.xml changes)

Settings
========
Configure CXF

Goto Window >> Preference
Select Web Services >> CXF 2.x Preferences (This option will be available in Eclipse 3.6 or above)
Click on "Add", we have downloaded CXF so we need to "Brows" the home directory of CXF. click on OK >> Finish.
Select the default CXF and click on OK.

CXF Runtime. By default tomcate uses the Axis so i need to change it to CXF.

Goto Window >> Preference
Select Web Services >> Server and Runtime
Change the "Web service runtime" to Apache CXF 2.x.
Click OK to finalize the setup.
