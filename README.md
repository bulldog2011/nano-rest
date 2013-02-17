nano-rest
=========

A light-weight restful client for Android, using Nano binding framework

###Overview
Can be used to issue synchronous or asynchronous requests toward your API. There is a service class that handles request execution by two kinds of thread pools(choice can be specified in the request implementation): either a single thread executor or a fixed size executor. Each of the executors is backed by a priority queue which means each individual request can have an execution priority set.

You can also provide your own service class which will handle the requests, extend from the current ones etc...

Custom request pre-process and reponse parsing logic can be added by extending existing ones, [Nano](https://github.com/bulldog2011/nano) binding framework is supported to automatically marshall request object into xml content or unmarshall xml content into response object, schema or wsdl driven development is also supported by leveraging [mxjc](https://github.com/bulldog2011/mxjc) binding compiler. 

By default authentication is handled by setting an OAuth token in the header, but can be replaced with a custom implementation.

Note: The process of getting an oauth token from the server is not part of this library implementation and have to be set according to the specification for your webserivce.


###Steps to setup the library
1. Add nano-rest-xxx-shaded.jar in the classpath of your project.  
Download latest [0.5.0 snapshot release](https://github.com/bulldog2011/bulldog-repo/tree/master/repo/snapshots/com/leansoft/nano-rest/0.5.0-SNAPSHOT)  
***Note:*** please use the shaded jar which includes Nano dependency, if not, you should add Nano jar reference by yourself.
2. Look into the project manifest and copy the definitions below.

###Required Manifest Declarations
```
  <uses-permission android:name="android.permission.INTERNET" />

  <uses-sdk android:minSdkVersion="7" />

  <application>
    <service android:name="com.leansoft.nanorest.service.HTTPRequestExecutorService" >
    </service>
  </application>

```
