package uristqwerty.CraftGuide.ui.Rendering;

import uristqwerty.CraftGuide.ui.GuiRenderer;
import net.minecraft.src.ModLoader;

public class Text implements IRenderable
{
	protected int x, y;
	protected String text;
	protected int color;
	
	public Text(int x, int y, String text, int color)
	{
		this.x = x;
		this.y = y;
		this.text = text;
		this.color = color;
	}
	public Text(int x, int y, String text)
	{
		this(x, y, text, 0xff000000);
	}

	@Override
	public void render(GuiRenderer renderer, int xOffset, int yOffset)
	{
		renderer.drawText(x + xOffset, y + yOffset, text, color);
	}
	
	public void setText(String text)
	{
		this.text = text;
	}
	
	public int textHeight()
	{
		return 8;
	}
	
	public int textWidth()
	{
		return ModLoader.getMinecraftInstance().fontRenderer.getStringWidth(text);
	}
	
	public static int textWidth(String text)
	{
		return ModLoader.getMinecraftInstance().fontRenderer.getStringWidth(text);
	}
}