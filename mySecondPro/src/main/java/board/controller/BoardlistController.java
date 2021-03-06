package board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.dto.MyBoardDTO;
import board.service.MyBoardService;

@Controller
public class BoardlistController {
	@Autowired
	MyBoardService service;

	
	@RequestMapping(value="/board_list.do", method = RequestMethod.GET)
	public ModelAndView showBoardList(HttpServletRequest req){
		ModelAndView mav = new ModelAndView();
		List<MyBoardDTO> boardlist = service.BoardList();
		mav.addObject("boardlist", boardlist);
		mav.setViewName("board/board_list");
		return mav;
	}

}
