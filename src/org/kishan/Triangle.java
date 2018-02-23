package org.kishan;

//import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


/*
public class Triangle {
	/*
		//SETTER INJECTION below code used for setter and getter methods
	private String type;
	private int height;
	
	public void setType(String type) 
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
	}
	
	public void setheight(int height) 
	{
		this.height = height;
	}

	public int getheight() 
	{
		return height;
	}
	
	public void draw()
	{
		System.out.println(getType() + "Triangle drawn" + getheight());
		System.out.println("Triangle drawn");
	}
*/
	
/*
	//Constructor Injection.
	private String type;
	private int height;
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public String getType() 
	{
		return type;
	}

	public void setheight(int height) 
	{
		this.height = height;
	}
	
	public int getheight() 
	{
		return height;
	}
	
	public Triangle(String type)
	{
	//super();
	this.type = type;
	}

	public Triangle(String type,int height)
	{
	//super();
	this.type = type;
	this.height=height;
	}

public void draw()
{
	System.out.println(getType() + " Triangle drawn of height " + getheight());
	//System.out.println("Triangle drawn");
}
*/
	/*

	//  object creation	
	private Point pointa;
	private Point pointb;
	private Point pointc;
	
	public Point getPointa() {
		return pointa;
	}

	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}

	public Point getPointb() {
		return pointb;
	}

	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}

	public Point getPointc() {
		return pointc;
	}

	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}

	public void draw()
	{
		System.out.println("Point A : " + getPointa().getX() + ","+ getPointa().getY());
		System.out.println("Point B : " + getPointb().getX() + ","+ getPointb().getY());
		System.out.println("Point C : " + getPointc().getX() + ","+ getPointc().getY());
		//System.out.println("Hello");
	}
	
	*/
	
/*
	//Collection List
	private List<Point> points;
	 
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw()
	{
		for(Point point : points)
		{
			System.out.println("Point : " + point.getX() + ","+ point.getY());

		}
	}*/
	
	/*
	// autowire with "byName" (for multiple member variable) and "byType" (only for 1 member variable) 10th video
	private Point pointa;
	private Point pointb;
	private Point pointc;
	public Point getPointa() {
		return pointa;
	}
	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}
	public Point getPointb() {
		return pointb;
	}
	public void setPointb(Point pointb) {
		this.pointb = pointb; 
	}
	public Point getPointc() {
		return pointc;
	}
	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}
	public void draw()
	{
		System.out.println("value of pointa : " + getPointa().getX() + " " + getPointa().getY());
		System.out.println("value of pointb : " + getPointb().getX() + " " + getPointb().getY());
		System.out.println("value of pointc : " + getPointc().getX() + " " + getPointc().getY());
	}*/
	
	/*
	//autowire with "constructor" { try it out }
	private Point pointa;
	private Point pointb;
	//private Point pointc;
	public Triangle(Point pointa,Point pointb)
	{
		this.pointa=pointa;
		this.pointb=pointb;
	}
	public void draw()
	{
		System.out.println("value of pointa : " + pointa.getX() + " " + pointa.getY());
		//System.out.println("value of pointb : " + pointb);
	}
}*/


/*
//ApplicationContext Aware **** 12th Video ****
	public class Triangle implements ApplicationContextAware, BeanNameAware
	{
		private Point pointa;
		private Point pointb;
		private Point pointc;
		private ApplicationContext context=null;
		public Point getPointa() {
			return pointa;
		}
		public void setPointa(Point pointa) {
			this.pointa = pointa;
		}
		public Point getPointb() {
			return pointb;
		}
		public void setPointb(Point pointb) {
			this.pointb = pointb;
		}
		public Point getPointc() {
			return pointc;
		}
		public void setPointc(Point pointc) {
			this.pointc = pointc;
		}
		
		public void draw()
		{
			System.out.println("value of pointa : " + getPointa().getX() + " " + getPointa().getY());
			System.out.println("value of pointb : " + getPointb().getX() + " " + getPointb().getY());
			System.out.println("value of pointc : " + getPointc().getX() + " " + getPointc().getY());
		}
		public void setApplicationContext(ApplicationContext context) throws BeansException 
		{
			this.context=context;
		}
		@Override
		public void setBeanName(String beanName) 
		{
			System.out.println("Bean name is " + beanName);
			
		}
	}
	*/


/*
//13th video with 3 objects
public class Triangle 
{
	private Point pointa;
	private Point pointb;
	private Point pointc;
	private ApplicationContext context=null;
	public Point getPointa() {
		return pointa;
	}
	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}
	public Point getPointb() {
		return pointb;
	}
	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}
	public Point getPointc() {
		return pointc;
	}
	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}
	
	public void draw()
	{
		System.out.println("value of pointa : " + getPointa().getX() + " " + getPointa().getY());
		System.out.println("value of pointb : " + getPointb().getX() + " " + getPointb().getY());
		System.out.println("value of pointc : " + getPointc().getX() + " " + getPointc().getY());
	}
}

*/

/*
//with the Collection "List"
public class Triangle 
{
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw()
	{
		for(Point point : points)
		{
			System.out.println("Point : " + point.getX() + ","+ point.getY());

		}
	}	
}*/


/*
//14th video
//public class Triangle implements InitializingBean, DisposableBean
public class Triangle
{
	private Point pointa;
	private Point pointb;
	private Point pointc;
	
	public Point getPointa() {
		return pointa;
	}
	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}
	public Point getPointb() {
		return pointb;
	}
	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}
	public Point getPointc() {
		return pointc;
	}
	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}
	
	public void draw()
	{
		System.out.println("Point a : " +getPointa().getX() + " " + getPointa().getY());
		System.out.println("Point b : " +getPointb().getX() + " " + getPointb().getY());
		System.out.println("Point c : " +getPointc().getX() + " " + getPointc().getY());
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialising bean init method called for Triangle");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("bean has been destroyed");
		
	}
	
	public void myInit()
	{
		System.out.println("MYINIT method in Triangle");
	}
	
	public void cleanUp()
	{
		System.out.println("Cleanup method in Triangle");
	}
}*/


public class Triangle implements InitializingBean, DisposableBean
{
	private Point pointa;
	private Point pointb;
	private Point pointc;
	
	public Point getPointa() {
		return pointa;
	}
	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}
	public Point getPointb() {
		return pointb;
	}
	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}
	public Point getPointc() {
		return pointc;
	}
	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}
	
	public void draw()
	{
		System.out.println("Point a : " +getPointa().getX() + " " + getPointa().getY());
		System.out.println("Point b : " +getPointb().getX() + " " + getPointb().getY());
		System.out.println("Point c : " +getPointc().getX() + " " + getPointc().getY());
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialse beans");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable beans");

	}
}
