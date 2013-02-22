nano-rest
=========

A light-weight restful client for Android, using Nano binding framework

###Overview
Can be used to issue synchronous or asynchronous requests toward your API. There is a service class that handles request execution by two kinds of thread pools(choice can be specified in the request implementation): either a single thread executor or a fixed size executor. Each of the executors is backed by a priority queue which means each individual request can have an execution priority set.  
You can also provide your own service class which will handle the requests, extend from the current ones etc...

Custom request pre-process and reponse parsing logic can be added by extending existing ones, [Nano](https://github.com/bulldog2011/nano) binding framework is supported to automatically marshall request object into xml content or unmarshall xml content into response object, schema or wsdl driven development is also supported by leveraging [mxjc](https://github.com/bulldog2011/mxjc) binding compiler. 

Pluggable authentication is supported, a default authentication provider is provided which setts an OAuth token in the header, you can plug in a custom implementation according to the specification of your services.  
Note: The process of getting an oauth token from the server is not part of this library implementation and have to be set according to the specification for your webserivce.


###Steps to setup the library
1. Add nano-rest-xxx-shaded.jar in the classpath of your project.  
Download latest [0.5.0 snapshot release](https://github.com/bulldog2011/bulldog-repo/tree/master/repo/snapshots/com/leansoft/nano-rest/0.5.0-SNAPSHOT)  
***Note:*** please use the shaded jar which includes [Nano](https://github.com/bulldog2011/nano) dependency, if not, you should add Nano jar reference by yourself.
2. Look into the project manifest and add the definitions below.

###Required Manifest Declarations
```
  <uses-permission android:name="android.permission.INTERNET" />

  <uses-sdk android:minSdkVersion="7" />

  <application>
    <service android:name="com.leansoft.nanorest.service.HTTPRequestExecutorService" >
    </service>
  </application>

```

###Docs
1. [Schema Driven Web Serivce Client Development on Android, Part 1 : Hello eBay Finding](http://bulldog2011.github.com/blog/2013/02/17/schema-driven-on-android-part-1-hello-ebay-finding/)
2. [Schema Driven Web Serivce Client Development on Android, Part 2 : eBay Search App](http://bulldog2011.github.com/blog/2013/02/19/schema-driven-on-android-part-2-ebay-search/)

###Samples
1. [Hello eBay Finding](https://github.com/bulldog2011/nano-rest/tree/master/sample/HelloEBayFinding)
2. [Hello eBay Shopping](https://github.com/bulldog2011/nano-rest/tree/master/sample/HelloEBayShopping)
3. [Hello eBay Trading](https://github.com/bulldog2011/nano-rest/tree/master/sample/HelloEBayTrading)  
4. [eBay Search App](https://github.com/bulldog2011/nano-rest/tree/master/sample/EBaySearch)

###Copyright and License
Copyright 2012 LeanSoft, Inc.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License. You may obtain a copy of the License in the LICENSE file, or at:

[http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

###Contribution
The original source of Nano-rest is forked from [this github project](https://github.com/darko1002001/android-rest-client), many thanks to the original author.


