package UpperCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;


public class UpperCaseInputStream extends FilterInputStream {

	protected UpperCaseInputStream(BufferedInputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toUpperCase((char)c));
	}

	public int read (byte[] b, int offset, int len) throws IOException {
		int result = super.read(b,  offset, len);
		for (int i = offset; i < offset+result; i++) {
			b[i] = (byte)Character.toUpperCase((char)b[i]);
		}
		return result;
	}
}
