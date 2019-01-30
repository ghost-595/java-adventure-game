public interface GameObject 
{	
	//Called every time phsically possible
	public void render(RenderHandler renderer, int xZoom, int yZoom);
	
	//Call at 60 fps rate
	public void update(Game game);
	
	//call whenever mouse is click in canvas
	public boolean handleMouseClick(Rectangle mouseRectangle, Rectangle camera, int xZoom, int yZoom);
}
