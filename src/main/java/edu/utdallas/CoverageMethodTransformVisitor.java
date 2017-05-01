package edu.utdallas;


import java.util.ArrayList;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class CoverageMethodTransformVisitor extends MethodVisitor implements Opcodes{
	
	boolean isTest;
	int mline;
	String mName;
	Label mlabel;
	static String classname;
	static String methodname;
	int flag=0;
	public CoverageMethodTransformVisitor(int api, final MethodVisitor mv) {
		super(api, mv);
		this.mName=mName;
	}

	@Override
    public void visitFieldInsn(int opcode, String owner, String name, String desc) {
        	classname=desc;
    	super.visitFieldInsn(opcode, owner, name, desc);
    } 
    
	@Override
	public void visitLineNumber(int line, Label start) {

		mline=line;
	    mlabel=start;  
	    String linename= classname+":"+line;
	    mv.visitLdcInsn(linename);
	    mv.visitMethodInsn(INVOKESTATIC, "edu/utdallas/AddDetails", "add", "(Ljava/lang/String;)V", false);

    	super.visitLineNumber(line, start);
	}
		
	@Override
	public void visitLabel(Label lbl)
	{			 
					String linename= classname+":"+mline;
					mv.visitLdcInsn(linename);
					mv.visitMethodInsn(INVOKESTATIC, "edu/utdallas/AddDetails", "add", "(Ljava/lang/String;)V", false);
				
			super.visitLabel(lbl);

	}
}
