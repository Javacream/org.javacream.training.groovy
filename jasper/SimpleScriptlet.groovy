package org.javacream.training.jasper

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.18.1')
@Grab(group='com.lowagie', module='itext', version='4.2.0')

import net.sf.jasperreports.engine.JRDefaultScriptlet

class SimpleScriptlet extends JRDefaultScriptlet{
    def simpleScriptlet(){
        def name = getParameterValue("message")
        return "Hello from SimpleScriptlet"
    }
}