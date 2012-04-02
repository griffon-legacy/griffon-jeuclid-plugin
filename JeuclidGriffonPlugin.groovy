/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by getApplication()licable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 */
 
/**
 * @author Andres Almiray
 */
class JeuclidGriffonPlugin {
    // the plugin version
    String version = '0.2'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '0.9.5']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-jeuclid-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'MathML Renderer'
    String description = '''
A MathML rendering plugin via [JEuclid][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*      | *Type*                                         |
| ----------- | ---------------------------------------------- |
| mathMLViewer| `net.sourceforge.jeuclid.swing.JMathComponent` |


### Example

A sample application is available at [https://github.com/aalmiray/griffon_sample_apps/tree/master/misc/jeuclid][2].
It reproduces the 7 examples available from the JEuclid project site.

[1]: http://jeuclid.sourceforge.net/index.html
[2]: https://github.com/aalmiray/griffon_sample_apps/tree/master/misc/jeuclid
'''
}

