package com.sist.main;
abstract class board{
	public abstract void write();
	public abstract void list();
	public abstract void detail();
	public void update() {}
	public abstract void delete();
	public void find() {}
}
class 게시판 {
	public void write() {}
	public void list() {}
	public void detail() {}
	public void update() {}
	public void delete() {}
	public void find() {}
}
class 자료실 extends board {
	public void upload() {}
	public void download() {}
	@Override
	public void write() {
		
	}
	@Override
	public void list() {
		
	}
	@Override
	public void detail() {
		
	}
	@Override
	public void delete() {
		
	}
}
class 답변게시판 extends board {
	public void reply() {}

	@Override
	public void write() {
		
	}

	@Override
	public void list() {
		
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}
class 댓글게시판 extends board {
	public void replywrite() {}
	public void replydelete() {}
	public void replyupdate() {}
	@Override
	public void write() {
		
	}
	@Override
	public void list() {
		
	}
	@Override
	public void detail() {
		
	}
	@Override
	public void delete() {
		
	}
}
public class Main {

}
